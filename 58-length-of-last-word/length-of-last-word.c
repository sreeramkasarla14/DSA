int lengthOfLastWord(char* s) {
    int n = strlen(s);
    int i,length = 0;
    char temp;
    for(i=0;i<n/2;i++)
    {
        temp = s[i];
        s[i] = s[n-1-i];
        s[n-1-i]=temp;
    }
    i=0;
    while(s[i]==' ')
    {
        i++;
    }
    while(s[i]!='\0' && s[i]!=' ')
    {
        length++;
        i++;
    }
    return length;
}