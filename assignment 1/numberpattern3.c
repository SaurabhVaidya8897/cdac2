//Write a program in C to make such a pattern like right angle triangle with number increased by 1
#include<stdio.h>
main()
{
	int i,j,n;
	printf("enter value");
	scanf("%d",&n);
	int a=1;
	for(i=1; i<=n; i++){
		
		for(j=1; j<=i; j++){
			printf("%d",a);
			a++;
		
	}
	printf("\n");
}
			
}
