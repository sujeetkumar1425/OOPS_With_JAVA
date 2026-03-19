





class PalindromeNumber {
    public static void main(String[] args) {
        // Check if an argument is provided
        if (args.length == 0) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }

        try {
            int original = Integer.parseInt(args[0]);
            int number = original;
            int reverse = 0;

            // Reverse the number
            while (number != 0) {
                int digit = number % 10;
                reverse = reverse * 10 + digit;
                number /= 10;
            }

            // Check palindrome
            if (original == reverse) {
                System.out.println(original + " is a palindrome.");
            } else {
                System.out.println(original + " is not a palindrome.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid integer.");
        }
    }
}




