bool isSameAfterReversals(int num) {
    int reversed1,reversed2,r= 0,n,rem;
    n=num;
    while(num!=0){
        rem=num%10;
        r=r*10+rem;
        num=num/10;
    }
    
    reversed1=r;
    r=0;
    while(reversed1!=0){
         rem=reversed1%10;
    r=r*10+rem;
    reversed1=reversed1/10;
    }
    reversed2=r;
    if (reversed2==n)
        return 1;
    else
        return 0;
}