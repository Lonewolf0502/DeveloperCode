/*!
 * --Simple code to reverse a string 
 *
 * Author: Anshuman Das(https://github.com/ANSHUMANDAS1506)
 * Date:3/10/2022
 * 
 */


/*Basic principle in queue is "First In First Out" which is used here 
using linked list where 2 pointers are made ie 'front' and 'rear'
*/
#include <stdio.h>//header file which refers to standand input and output
#include <conio.h>//header file to use getch() operation
#include <stdlib.h>//header file to use general operation 
struct node //assigning node for the LL
{
    int data;
    struct node *next;
};
struct node *front = NULL;
struct node *rear = NULL;
void insert(int x)//Creating insertion function 
{
    struct node *newnode = (struct node *)malloc(sizeof(struct node));
    newnode->data = x;
    newnode->next = NULL;
    if (front == NULL && rear == NULL)
    {
        front = newnode;
        rear = newnode;
    }
    else
    {
        rear->next = newnode;
        rear = newnode;
    }
    printf("The element %d Inserted succesfully \n", x);
}
void delete()//creating delete function
{
    if (front == NULL)//condition for queue to be empty
    {
        printf("Anshuman das\nQueue is Empty");
    }
    else
    {
        struct node *temp = front;
        front = temp->next;
        free(temp);
    }
}
void display()
{
    struct node *temp = front;
    if (front == NULL)
    {
        printf("Anshuman das\nQueue is Empty");
    }
    else
    {
        printf("Anshuman das\nThe element in Queue are\n");
        while (temp != NULL)
        {
            printf("%d\n", temp->data);
            temp = temp->next;
        }
    }
}
int main()
{
    struct node *head;
    head = NULL;
    int ch, val;
    int x;
    void insert(int x);
    void delete ();
    void display();
    do
    {
        printf("Anshuman das\n");
        printf("Operations on Queue\n");
        printf("1.Insert \n2.Delete \n3.Display \n4.Exit\n");//Basic queue operation
        printf("Enter your choice: ");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            printf("Anshuman das\nEnter the value to insert: ");
            scanf("%d", &val);
            insert(val); break;
        case 2:
            delete ();
            break;
        case 3:
            display();
            break;
        case 4:
            exit(1);
        default:
            printf("Anshuman das\nThe option is invalid\n");
            return 0;
        }
        getch();
    } 
    while (ch != 4);
    getch();
    return 0;
}