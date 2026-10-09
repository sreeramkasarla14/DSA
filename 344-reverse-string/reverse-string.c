void reverseString(char* s, int sSize) {
    int l=0,r=sSize-1;
    char temp='\0';
    while(l<r){
        temp=s[l];
        s[l]=s[r];
        s[r]=temp;
        l++;r--;

    }
    for(int i=0;i<sSize;i++){
        printf("%c ",s[i]);
    }
}