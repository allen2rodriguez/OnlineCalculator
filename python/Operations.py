class Operations:
    def __init__(self):
        # Variable holds the memory value
        self.memory = 0

    # Arithmetic Operations
    def add(self, a, b):
        return a + b

    def sub(self, a, b):
        return a - b

    def multi(self, a, b):
        return a * b

    def div(self, a, b):
        if b == 0:
            return float('nan')
        else:
            return a / b

    def mod(self, a, b):
        if b == 0:
            return float('nan')
        else:
            return a % b

    def exp(self, a, b):
        return a ** b

    def root(self, a):
        if a >= 0:
            return a ** 0.5
        else:
            return float('nan')

    def fac(self, a):
        if a == 1:
            return 1
        else:
            return a * self.fac(a - 1)


#Testing of the Operations:
ops = Operations()

# Test arithmetic operations
print("Addition:", ops.add(5, 3))  # Expected output: 8
print("Subtraction:", ops.sub(5, 3))  # Expected output: 2
print("Multiplication:", ops.multi(5, 3))  # Expected output: 15
print("Division:", ops.div(5, 3))  # Expected output: 1.6666666666666667
print("Modulus:", ops.mod(5, 3))  # Expected output: 2
print("Exponentiation:", ops.exp(2, 3))  # Expected output: 8
print("Square Root:", ops.root(9))  # Expected output: 3.0
print("Factorial:", ops.fac(5))  # Expected output: 120