

int countOdds(int low, int high){
    int i=0;
    for(int x=low;x<=high;x++){
        if(x%2!=0)
            i++;
    }
    return i;
}