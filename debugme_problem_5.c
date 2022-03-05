#include <stdio.h>
#include <string.h>

// Expected Output
// 'He' + 'llo ' + 'World' = Hello World

int main()
{
    char *a = "He";
    const char *b = "llo ";
    const char *c = "World";

    printf("'%s' + '%s' + '%s' = Hello World ", a, b, c);


    return 0;
}
