int evalRPN(char** tokens, int tokensSize) {
    int stack[10001];
    int top=-1;
    for(int i=0;i<tokensSize;i++){
        if(isdigit(tokens[i][0]) || (tokens[i][0] == '-' && strlen(tokens[i]) > 1)){
            top++;
            stack[top]=atoi(tokens[i]);
        }
        else if(strcmp(tokens[i],"+")==0){
            int a;
            int b;
            a=stack[top];
            top--;
            b=stack[top];
            top--;
            stack[++top]=a+b;
        }
        else if(strcmp(tokens[i],"-")==0){
            int a;
            int b;
            a=stack[top];
            top--;
            b=stack[top];
            top--;
            stack[++top]=b-a;

        }
        else if(strcmp(tokens[i],"*")==0){
            int a;
            int b;
            a=stack[top];
            top--;
            b=stack[top];
            top--;
            stack[++top]=a*b;
            
        }
        else if(strcmp(tokens[i],"/")==0){
            int a;
            int b;
            a=stack[top];
            top--;
            b=stack[top];
            top--;
            stack[++top]=b/a;

        }
    }
    return stack[top];
    
}