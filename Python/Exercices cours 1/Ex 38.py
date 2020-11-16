def main():
    
    s = "Python est un langage de programmation"
    L = s.split()
    n = len(L)
    premier = L[0]
    dernier = L[n-1]

    L.pop(n-1)
    L.pop(0)

    s1 = " ".join(L)
    s = dernier + " " + s1 + " " + premier
    print(s)

if __name__ == '__main__':
    main()
