def addDigits(num):
        """
        :type num: int
        :rtype: int
        """
        count = 0
        while num != 0:
            count += num % 10
            num /= 10
        print(count)
        if count > 9:
            addDigits(count)
        else:
            print("h", count)
            return count
            
print(addDigits(38))