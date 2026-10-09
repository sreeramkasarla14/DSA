#include <stdbool.h>
#include <string.h>

static const int lookup[2][5] = {
    {0, 6, 2, 8, 4},
    {5, 1, 7, 3, 9}
};

int lucasTheorem(int n, int k, int prime) {
    int res = 1;
    while (n > 0 || k > 0) {
        int ni = n % prime;
        int ki = k % prime;
        if (ki > ni) return 0;
        int num = 1, den = 1;
        for (int i = 0; i < ki; i++) {
            num *= (ni - i);
            den *= (i + 1);
        }
        res = (res * (num / den)) % prime;
        n /= prime;
        k /= prime;
    }
    return res;
}

int nCkMod10(int n, int k) {
    int mod2 = lucasTheorem(n, k, 2);
    int mod5 = lucasTheorem(n, k, 5);
    return lookup[mod2][mod5];
}

bool hasSameDigits(char* s) {
    int n = strlen(s);
    int num1 = 0;
    int num2 = 0;
    for (int i = 0; i <= n - 2; ++i) {
        int coeff = nCkMod10(n - 2, i);
        num1 = (num1 + coeff * (s[i] - '0')) % 10;
        num2 = (num2 + coeff * (s[i + 1] - '0')) % 10;
    }
    return num1 == num2;
}
