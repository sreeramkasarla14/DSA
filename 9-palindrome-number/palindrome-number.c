

bool isPalindrome(int x) {
    // Negative numbers are not palindromes
    if (x < 0) return false;
    
    int n = x;
    long long r = 0; 
    
    while (x > 0) {
        int rem = x % 10;
        r = r * 10 + rem;
        x = x / 10;
    }
    
    return (n == r);
}