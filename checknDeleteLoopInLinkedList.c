#include <stdio.h>
#include <stdlib.h>

struct node {
  int data;
  struct node *next;
};

void disp(struct node *q) {
  struct node *p = q;
  while (p) {
    printf("%d\n", p->data);
    p = p->next;
  }
}

struct node *checkReturnLoop(struct node *head) {
  struct node *p, *q;
  p = q = head;
  while (p && q) {
    q = q->next;
    if (p) {
      q = q->next;
    }
    p = p->next;
    if (p == q) {
      return p;
    }
  }
  return NULL;
}

struct node *detect(struct node *head) {
  struct node *t = checkReturnLoop(head);
  if (t == NULL) {
    printf("loop not detected");
    return NULL;
  } else {
    struct node *p = head;
    while (p != t) {
      p = p->next;
      t = t->next;
    }
    return p;
  }
}

void breakLoop(struct node *head) {
  struct node *t = checkReturnLoop(head);
  struct node *p = t;
  while (p->next != t) {
    p = p->next;
  }
  t->next = NULL;
  disp(head);
}

int main() {

  struct node *first = (struct node *)malloc(sizeof(struct node));
  struct node *second = (struct node *)malloc(sizeof(struct node));
  struct node *third = (struct node *)malloc(sizeof(struct node));
  struct node *fourth = (struct node *)malloc(sizeof(struct node));

  first->data = 1;
  first->next = second;

  second->data = 2;
  second->next = third;

  third->data = 3;
  third->next = fourth;

  fourth->data = 4;
  fourth->next = second;

  int x = detect(first)->data;
  printf("the starting node of the loop in the linked list is %d\n", x);
  breakLoop(first);

  return 0;
}
