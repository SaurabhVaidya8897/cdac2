//Write a program in C to make such a pattern like right angle triangle with a number which will repeat a number in a row.
#include<stdio.h>
main()
{
	int i,j,n;
	printf("enter value");
	scanf("%d",&n);
	for(i=1; i<=n; i++){
		for(j=1; j<=i; j++){
			printf("%d",i);
		
	}
	printf("\n");
}
			
}
