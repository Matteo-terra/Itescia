def main():
    
    def removeDuplicate(l):
        unique = []
        for x in l:
            if x not in unique:
                unique.append(x)
        return unique        

    l = [2, 7, 13, 2, 17, 13, 2, 7, 13]
    print (removeDuplicate(l))


if __name__ == '__main__':
    main()
