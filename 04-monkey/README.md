# Part 4 - Monkey

Monkey is a tool which can run on the device or emulator and it creates random streams such as clicks, touches, gestures, or number of system-level events. 

It is a great tool for stress testing your applications. If the application crashes or receives any exception or ANR, the Monkey will stop and report the error.

Monkey is a command line tool. Syntax is following:

```bash
adb shell monkey [options] <event-count>
```

## Code lab

### Open command line and use the Monkey tool

Type the command into the console when your application is opened on emulator or device. 

It's better to test the application in the emulator because Monkey tool does lots of stuff (for example changes brightness...):

```bash
adb shell monkey -p package_name -v 500
```

So for example for our last application with package `net.moudra.testrecorderapp`:

```bash
adb shell monkey -p net.moudra.testrecorderapp -v 500
```

For more options type:

```bash
adb shell monkey --help
```

# More resources

* [Monkey](https://developer.android.com/studio/test/monkey.html)
