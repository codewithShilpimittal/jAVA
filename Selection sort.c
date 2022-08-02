#include<stdio.h>
#include<conio.h>
int main()
{
int arr[6]={7,4,10,8,3,2};
int i,j,n=6,swap;
for(i=0;i<n-1;i++)

{
    int minimum=i;
for(j=i+1;j<n;j++)
  {
     if(arr[j]<arr[minimum])
       {
          minimum=j;
       }
     if(minimum!=i)
       {
         swap = arr[i];
         arr[i] = arr[minimum];
         arr[minimum] = swap;
      }
       }
  }
 for(i=0;i<n;i++)
  printf("SOrted list=%d\n",arr[i]);

}
