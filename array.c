#include<stdio.h>
int main()
{
	int a[]={1,2,3,4,5};
	int i,add=0;
	for(i=0;i<5;i++)
	{
		add+=a[i];
	}
	printf("sum of array =%d",add);
	return 0;
}	
