class Node:
    def __init__(self, value, expre):
        self.value = value
        self.expre = expre
        self.next = None

class polynomial:
    def __init__(self):
        self.head = None
    
    def push(self, value, expre):
        new_node = Node(value, expre)
        if self.head == None:
            self.head = new_node
            self.tail = new_node
        else:
            self.tail.next = new_node
            self.tail = new_node


    def Display(self):
        if self.head == None:
            print("---------Nothing to be displayed---------")
        else:
            current_node = self.head
            cnt = 0
            print("Polynomial Expression is:", end = " ")
            while current_node.next != None:
                if current_node.value >= 0 and cnt != 0:
                    print(f"+{current_node.value}*x^{current_node.expre}", end = "")
                elif current_node.value >= 0 and cnd == 0:
                    print(f"{current_node.value}*x^{current_node.expre}", end = "")
                elif current_node.value < 0:
                    print(f"{current_node.value}*x^{current_node.expre}", end = "")
                current_node = current_node.next
                cnt += 1
            if current_node.value >= 0:
                print(f"+ {current_node.value}*x^{current_node.expre}") #since while loop termminates and it wont print the data in last node
            else:
                print(f"{current_node.value}*x^{current_node.expre}") #since while loop termminates and it wont print the data in last node

 
 
poly_exp = polynomial()
cnd = True

print("Enter your polynomial expression:")
# Lets try this method afterwards
# expression = input("Enter your polynomial expression: ").split()

while cnd:
    print("Menu (enter number):\n\tEnter 1 to add\n\tEnter 0 to quit")
    query = int(input("Enter your option: "))
    if query == 1:
        val = int(input("Enter Value: "))
        powe = int(input("Enter Power: "))
        poly_exp.push(val, powe)
    elif query == 0:
        print("Your Polynomial Expression has been stored Successfully")
        cnd = False
    else:
        print("Enter a valid char from menu!!")

poly_exp.Display()
