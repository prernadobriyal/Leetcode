//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// a node of the doubly linked list
class DLLNode
{
public:
    int data;
    DLLNode *next;
    DLLNode *prev;
    DLLNode(int val)
    {
        data = val;
        this->next = NULL;
        this->prev = NULL;
    }
};


// } Driver Code Ends
//User function Template for C++

/*
// a node of the doubly linked list
class DLLNode
{
public:
    int data;
    DLLNode *next;
    DLLNode *prev;
    DLLNode(int val)
    {
        data = val;
        this->next = NULL;
        this->prev = NULL;
    }
};
*/
class Solution
{
public:

    DLLNode* merge(DLLNode* left,DLLNode* right){
        if(left==NULL){
            return right;
        }
        
        if(right==NULL){
            return left;
        }
        DLLNode* result=NULL;
        if(left->data < right->data){
            result=left;
            result->next=merge(left->next,right);
            result->next->prev=result;
        }else{
            result=right;
            result->next=merge(left,right->next);
            result->next->prev=result;
        }
        return result;
    }
     

     DLLNode* middle(DLLNode* &head){
         DLLNode* slow=head;
         DLLNode* fast=head;
         
         while(fast->next!=NULL && fast->next->next!=NULL){
             slow=slow->next;
             fast=fast->next->next;
         }
         return slow;
     }
    
    
    // function to sort a k sorted doubly linked list
    DLLNode *sortAKSortedDLL(DLLNode *head, int k)
    {
        //base case
        if(head==NULL || head->next==NULL){
            return head;
        }
        
        DLLNode* midNode=middle(head);
        DLLNode* secondpart=midNode->next;
        midNode->next=NULL;
        secondpart->prev=NULL;
        
        DLLNode* sortedFirstpart=sortAKSortedDLL(head,k);
        DLLNode* sortedSecondpart=sortAKSortedDLL(secondpart,k);
        
        DLLNode* ans=merge(sortedFirstpart,sortedSecondpart);
        return ans;
    }
};

//{ Driver Code Starts.

// Function to insert a node at the end
// of the Doubly Linked List
void push(DLLNode **tailRef, int new_data)
{
    // allocate node
    DLLNode *newNode = new DLLNode(new_data);

    // since we are adding at the end,
    // next is NULL
    newNode->next = NULL;

    newNode->prev = (*tailRef);

    // change next of tail node to new node
    if ((*tailRef) != NULL)
        (*tailRef)->next = newNode;

    (*tailRef) = newNode;
}

// Function to print nodes in a given doubly linked list
void printList(DLLNode *head)
{
    // if list is empty
    if (head == NULL)
        return;

    while (head != NULL)
    {
        cout << head->data << " ";
        head = head->next;
    }
}

// Driver
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n, k;
        cin >> n >> k;
        int a;
        cin >> a;
        DLLNode *head = new DLLNode(a);
        DLLNode *tail = head;
        for (int i = 0; i < n - 1; i++)
        {
            cin >> a;
            push(&tail, a);
        }
        Solution obj;
        printList(obj.sortAKSortedDLL(head, k));
        cout << "\n";
    }

    return 0;
}

// } Driver Code Ends