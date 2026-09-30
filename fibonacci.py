import unittest

def fibonacci(n: int) -> int:
    """Calcula o n-ésimo elemento da sequência de Fibonacci de forma recursiva."""
    if n <= 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fibonacci(n - 1) + fibonacci(n - 2)


# Testes Unitários para a Sequência de Fibonacci[cite: 11]
class TestFibonacci(unittest.TestCase):
    
    def test_fibonacci_caso_base_zero(self):
        # Testando o primeiro caso elementar (n = 0)[cite: 11]
        self.assertEqual(fibonacci(0), 0)

    def test_fibonacci_caso_base_um(self):
        # Testando o segundo caso elementar (n = 1)[cite: 11]
        self.assertEqual(fibonacci(1), 1)

    def test_fibonacci_decimo_elemento(self):
        # Testando um elemento maior (n = 10, o resultado esperado é 55)[cite: 11]
        self.assertEqual(fibonacci(10), 55)

if __name__ == "__main__":
    unittest.main()