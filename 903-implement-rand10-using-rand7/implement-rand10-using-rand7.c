// The rand7() API is already defined for you.
// int rand7();
// @return a random integer in the range 1 to 7

// The rand7() API is already defined for you.
// int rand7();

int rand10() {
    while (1) {
        // Generate a uniform number between 1 and 49
        int row = rand7();
        int col = rand7();
        int idx = (row - 1) * 7 + col;
        
        // Accept only the first 40 outcomes
        if (idx <= 40) {
            return (idx - 1) % 10 + 1;
        }
    }
}
