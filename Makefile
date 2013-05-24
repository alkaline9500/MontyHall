build: src/MontyHall.java
	javac -d bin/ -sourcepath src/ src/MontyHall.java
run:
	make build
	java -cp bin/ MontyHall 100
