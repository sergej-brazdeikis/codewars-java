package level6
import (
	"testing"
)

func TestMultiple3And5(t *testing.T) {
	tests := []struct{
		input    int
		expected int
	}{
		{3, 0},
		{5, 3},
		{6, 8},
		{7, 14},
		{10, 23},
	}

	for _, test := range tests {
		if got := Multiple3And5(test.input); got != test.expected {
			t.Errorf("Multiple3And5(%v) = %v, got %v", test.input, test.expected, got)
		}
	}
}
