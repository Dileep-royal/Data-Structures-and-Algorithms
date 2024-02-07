# Do You Know?

## How to initialize variable to minimum or maximum value from a  given values?

By using Integer Wrapper class.

Integer.MIN_VALUE

Integer.MAX_VALUE

## Speed test C VS Java VS Python

When we compile java programs, even without any optimization flags, Java JIT (Just-In-Time) compiler performs optimization automatically. However, that is not the case with GCC (which compiles the C program) where we have to explicitly set the optimization flags.

Hence, we have to use [-O2 and -O3 optimization](https://gcc.gnu.org/onlinedocs/gcc/Optimize-Options.html) flags when compiling the C program and carried out the experiment.

**Java code is 1.69 times slower** than C[-O3] while **Python code is 56 times slower**. 

In terms of speed, **Java is faster than Python as it is a compiled language**. It takes less time to execute a code. Python is an interpreted language and it determines the type of data at run time which makes it slower comparatively.