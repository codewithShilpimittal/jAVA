#include<stdio.h>
#include<conio.h>
int main()
{

 int a[6]={4,3,25,6,8,99};
 int i,j,n=6,flag,temp;
 for(i=0;i<n-1;i++)

  {
  flag=0;
      for(j=0;j<n-1-i; j++)
       {
         if(a[j]>a[j+1])
          {
            temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
            flag++;
          }
       }

  if(flag==0)
  break;
  }

  for(i=0;i<6;i++)
  printf("%d\n",a[i]);
  }
