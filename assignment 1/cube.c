//Write a program in C to display the cube of the number upto given an integer
#include <stdio.h>
main()
{
	int i,n,sum;
	printf("enter n term ");
	scanf("%d",&n);	
	for(i=1; i<=n; i++){
		sum=i*i*i;
		printf("\n %d",sum);
	}
	
}
