package level6

// https://www.codewars.com/kata/514b92a657cdc65150000006/train/go
func Multiple3And5(number int) int {

	m1 := 3
	m2 := 5
	sum := 0

	for i:=m1; i < number; i+=m1 {
		if i % m2 != 0 {
			sum += i
		}
	}

	for i:=m2; i < number; i+=m2 {
		sum += i
	}

	return sum
}