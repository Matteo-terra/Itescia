def main():
    
    notes = [12, 4, 14, 11, 18, 13, 7, 10, 5, 9, 15, 8, 14, 16]
    moyenne = []
    for x in notes:
        if(x >= 10):
            moyenne.append(x)

    print ("La liste contenant uniquement les notes supérieures à la moyenne est:\n", moyenne)


if __name__ == '__main__':
    main()
