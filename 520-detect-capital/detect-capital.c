bool detectCapitalUse(char* word) {
    int n = strlen(word);
    int upper = 0;
    for(int i=0;i<n;i++)
    {
        if(word[i]>='A' && word[i]<='Z')
        {
            upper++;
        }
    }
    if(upper == n || upper == 0)
    {
        return true;
    }
    if(upper == 1 && word[0]>='A' && word[0]<='Z')
    {
        return true;
    }
    return false;
}