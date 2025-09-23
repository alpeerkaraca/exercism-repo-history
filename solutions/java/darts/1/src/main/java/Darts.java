class Darts {
    int score(double xOfDart, double yOfDart) {
        double dist = xOfDart * xOfDart + yOfDart * yOfDart;
        if (dist <= 1)
            return 10;
        if (dist <= 25)
            return 5;
        if (dist <= 100)
            return 1;        
        return 0;
    }
}
