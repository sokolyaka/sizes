package com.sokolov.androidsizes;

class SizeEqualsAndHashCode {
    private SizeEqualsAndHashCode() {
    }

    static boolean equals(ISize a, Object o) {
        if (a == o) return true;
        if (o == null) return false;

        if (o instanceof ISize) {
            ISize b = (ISize) o;
            if (a.width() != b.width()) return false;
            return a.height() == b.height();
        } else {
            return false;
        }
    }

    static int hashCode(ISize size) {
        int result = size.width();
        result = 31 * result + size.height();
        return result;
    }


}
