public class MemoryUsage {
    //Whenever you are doing something all the variables and the objects you are using go to young generation and at some point it does mark and sweep
    // Thia is where java checks if the objects have references then it marks them as still in use when it is done anything that wasnt marked is removed.
    // To reduce the garbage collection time, things that are marked for many times and always have a reference
    // java moves them to a safe house as OLd generation and sweeps it less often.
}
