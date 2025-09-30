# ThemedForm-with-TextFields-Submit-Button
Build a login form (username + password fields). Use Material 3 theme colors and typography for styling. Add validation: show error text if fields are empty when submitting.

## Features
- **Material 3 TextFields** for username and password
- **Submit button** styled with theme colors
- **Validation**: error messages shown if fields are empty
- Uses **MaterialTheme.colorScheme** and **MaterialTheme.typography**
- Password input uses **PasswordVisualTransformation**

## Getting Started
### Prerequisites
- Android Studio (latest version recommended)

### How to Run
1. Clone the repository:
2. Open the project in Android Studio.

## Project Structure
- `MainActivity.kt`: Contains main Compose UI and state code.
- `ui.theme`: Contains app theme and styling.

## Usage
- Build and run the app to see a centered login screen with two input fields: Username and Password.
- Both fields use Material 3 OutlinedTextField components styled with theme colors and typography.
- The Password field masks entered text for privacy using PasswordVisualTransformation.
- Tap the Submit button to validate inputs; if either field is empty, an error message appears below the respective field in the theme's error color.
- The UI automatically displays error states with red outlines around empty fields when submission fails.

## Contributing
Contributions are welcome! Feel free to open issues or submit pull requests.

## License
This project is licensed under the MIT License - see the LICENSE file for details.

## Author
Jerry Teixeria  
BU Email: jerrybt@bu.edu
