// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

int firstBadVersion(int n) {
    int l,u,m;
    l=1;
    u=n;
    while(l<u){
        m=l+(u-l)/2;
        if(isBadVersion(m))u=m;
        else l=m+1;

    }
    return l;
    
}