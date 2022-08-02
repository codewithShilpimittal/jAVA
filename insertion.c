#include<stdio.h>
#include<conio.h>
int main()
{
int a[5]={5,4,10,6,1};
int i,j,temp,n=5;
for(i=1;i<n;i++)
{
    temp=a[i];
    j=i-1;
    while(j>=0 && a[j]>temp)
    {

a[j+1]=a[j];
j--;
    }
    a[j+1]=temp;
}
for(i=0;i<n;i++)
{
    printf("%d\n",a[i]);
}
}
