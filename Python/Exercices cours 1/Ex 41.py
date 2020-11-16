def main():
    
    def nombreDivisibles(l,n):
        i = 0
        for k in l:
            if( k%n == 0):
                i = i + 1
        return i
    l = [12, 4, 7, 9,11]
    n = 3
    print("Le nombre d'élément de l qui sont divisible par ",n, " est : ",nombreDivisibles(l,n)) 


if __name__ == '__main__':
    main()
