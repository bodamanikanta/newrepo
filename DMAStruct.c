#include <stdio.h>
#include <stdlib.h>
struct student
{
  char name[50];
  int roll;
  int marks;
};
int main()
{
  typedef struct student stu;
  int n,i;
  printf("Enter number of students : ");
  scanf("%d",&n);

  stu *ptr;
  ptr=(stu *)malloc(n*sizeof(stu));
  printf("Enter Name, Roll number, and Marks of students : \n");
  for(i=0;i<n;i++)
  {
    scanf("%s %d %d",(ptr+i)->name,&((ptr+i)->roll),&((ptr+i)->marks));
  }
  printf("Details of the students are : \n");
  for(i=0;i<n;i++)
  {
    printf("%s %d %d\n",(ptr+i)->name,(ptr+i)->roll,&(ptr+i)->marks);
  }
  return 0;
}