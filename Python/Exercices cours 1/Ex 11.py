def main():
    
    nb = int(input("Veuillez saisir  nombre : "))
    a = 1
    while a <= nb :  
        if nb%a == 0:
            print(a,"est un diviseur de",nb)
            a = a + 1
        else :
            a = a + 1


if __name__ == '__main__':
    main()