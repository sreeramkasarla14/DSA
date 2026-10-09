int lengthOfLastWord(char* s) {
    int length=0,j=0;
    while(s[j]!='\0'){
        j++;
    }
    j--;
    while(j>=0 && s[j]==' '){
        j--;
    }
    while(j>=0 && s[j]!=' '){
        length++;
        j--;
    }
    return length;
}