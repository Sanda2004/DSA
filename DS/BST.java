
class Node:
    def __init__(self, key):
        self.key = key
        self.left = None
        self.right = None

# Insert function for BST
def insert(root, key):
    if root is None:
        return Node(key)
    if key < root.key:
        root.left = insert(root.left, key)
    elif key > root.key:
        root.right = insert(root.right, key)
    return root

# Search function for BST
def search(root, key):
    
    if root is None or root.key == key:
        return root
    
    
    if key < root.key:
        return search(root.left, key)
    
    
    return search(root.right, key)


root = Node(8)
root = insert(root, 3)
root = insert(root, 10)
root = insert(root, 1)
root = insert(root, 6)
root = insert(root, 14)
root = insert(root, 4)
root = insert(root, 7)
root = insert(root, 13)


key = 7
result = search(root, key)
if result:
    print(f"Node {key} found in BST.")
else:
    print(f"Node {key} not found in BST.")
