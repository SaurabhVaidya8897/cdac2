//Write a program in C to display the multiplication table of a given integer
#include <stdio.h>
main()
{
	int i,n,sum;
	printf("Enter table:");
	scanf("%d",&n);
	for(i=1; i<=10; i++){
		sum=n*i;
		printf("\n %d*%d =%d",n,i,sum);
	}
	
}

