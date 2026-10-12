/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */
int guess(int num);
int guessNumber(int n){
    int g;
    int l=1;
    int u=n;
    int m;
    while(l<=u){
        m=l+(u-l)/2;
        g=guess(m);
        if(g==-1)u=m-1;
        else if(g==1)l=m+1;
        else return m;

    }
    return -1;
	
}