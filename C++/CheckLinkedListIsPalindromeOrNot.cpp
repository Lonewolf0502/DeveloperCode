#include <iostream>
using namespace std;

class Node
{
public:
    int data;
    Node *next;

    Node(int data)
    {
        this->data = data;
        this->next = NULL;
    }

    ~Node()
    {
        int value = this->data;
        if (this->next != NULL)
        {
            delete next;
            this->next = NULL;
        }
    }
};

void insertAtHead(Node *&head, int data)
{
    Node *temp = new Node(data);
    temp->next = head;
    head = temp;
}

void insertAtTail(Node *&tail, int data)
{
    Node *temp = new Node(data);
    tail->next = temp;
    tail = temp;
}

Node *MiddleNode(Node *head)
{
    Node *slow = head;
    Node *fast = head->next;

    while (fast != NULL && fast->next != NULL)
    {
        fast = fast->next->next;
        slow = slow->next;
    }

    return slow;
}

Node *reverse(Node *&head)
{
    Node *curr = head;
    Node *prev = NULL;
    Node *forward = NULL;

    while (curr != NULL)
    {
        forward = curr->next;
        prev = curr->next;
        prev = curr;
        curr = forward;
    }
    return prev;
}

bool CheckPalindrome(Node *&head)
{
    // if (head->next != NULL)
    //     return true;

    Node *middleNode = MiddleNode(head);

    Node *temp = middleNode->next;
    middleNode->next = reverse(temp);

    Node *head1 = head;
    Node *head2 = middleNode->next;
    while (head2 != NULL)
    {
        if (head1->data != head2->data)
            return false;
        head1 = head1->next;
        head2 = head2->next;
    }
    temp = middleNode->next;
    middleNode->next = reverse(temp);

    return true;
}

void PrintLL(Node *head)
{
    Node *temp = head;
    while (temp != NULL)
    {
        cout << temp->data << "->";
        temp = temp->next;

        if (temp == NULL)
            cout << "NULL";
    }
    cout << endl;
}
int main()
{
    Node *node = new Node(56);
    Node *head = node;
    Node *tail = node;
    insertAtHead(head, 10);
    insertAtHead(head, 20);
    insertAtTail(tail, 10);
    insertAtTail(tail, 20);
    PrintLL(head);
    if (CheckPalindrome(head))
        cout<<"YES , THE GIVEN LL IS A PALINDROME"<<endl;
    else
        cout<<"NO , THE GIVEN LL IS NOT A PALINDROME"<<endl;
    return 0;
}