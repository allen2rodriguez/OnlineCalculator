# Import the Operations class
from Operations import Operations

def main():
    # Create an instance of the Operations class
    ops = Operations()

    # Test arithmetic operations
    print("Addition:", ops.add(5, 3))
    print("Subtraction:", ops.sub(5, 3))
    print("Multiplication:", ops.multi(5, 3))
    print("Division:", ops.div(5, 3))
    print("Modulus:", ops.mod(5, 3))
    print("Exponentiation:", ops.exp(2, 3))
    print("Square Root:", ops.root(9))
    print("Factorial:", ops.fac(5))

    # Test memory functions
    print("Memory Recall:", ops.memoryRecall())
    ops.memory = 10  # Set memory to 10
    print("Memory Recall after setting:", ops.memoryRecall())
    ops.clear()  # Clear memory
    print("Memory Recall after clearing:", ops.memoryRecall())

if __name__ == "__main__":
    main()
