package com.example.themedformwithtextfieldsandsubmitbutton

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.themedformwithtextfieldsandsubmitbutton.ui.theme.ThemedFormWithTextFieldsAndSubmitButtonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ThemedFormWithTextFieldsAndSubmitButtonTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LoginInfo(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun LoginInfo( modifier: Modifier = Modifier) {
    // State variables to hold user input and error status
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var showError by remember { mutableStateOf(false) }

    // Layout container with vertical arrangement for form elements
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Title of login form styled using Material 3 typography & theme
        Text(
            "Login",
            style = MaterialTheme.typography.headlineMedium,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Username field
        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            label = { Text("Username") },
            isError = showError && username.isBlank(), // Highlight red if empty when submitting
            modifier = Modifier.fillMaxWidth()
        )
        // Conditional error message under the field
        if (showError && username.isBlank()) {
            Text(
                "Username cannot be empty",
                color = MaterialTheme.colorScheme.error,
                style = MaterialTheme.typography.bodySmall
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Password field
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            isError = showError && password.isBlank(), // Highlight red if empty when submitting
            modifier = Modifier.fillMaxWidth(),
            visualTransformation = PasswordVisualTransformation() // Mask input for security
        )
        // Conditional error message for password field
        if (showError && password.isBlank()) {
            Text(
                "Password cannot be empty",
                color = MaterialTheme.colorScheme.error,
                style = MaterialTheme.typography.bodySmall
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Submit button
        Button(
            onClick = {
                // show error if any field is empty
                showError = username.isBlank() || password.isBlank()
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Submit")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ThemedFormWithTextFieldsAndSubmitButtonTheme {
        LoginInfo()
    }
}