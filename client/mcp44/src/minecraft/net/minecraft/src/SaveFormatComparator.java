// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

package net.minecraft.src;


public class SaveFormatComparator
    implements Comparable
{

    public SaveFormatComparator(String s, String s1, long l, long l1, int i, 
            boolean flag)
    {
        fileName = s;
        displayName = s1;
        lastTimePlayed = l;
        sizeOnDisk = l1;
        gameType = i;
        field_22167_e = flag;
    }

    public String getFileName()
    {
        return fileName;
    }

    public String getDisplayName()
    {
        return displayName;
    }

    public long getSizeOnDisk()
    {
        return sizeOnDisk;
    }

    public boolean func_22161_d()
    {
        return field_22167_e;
    }

    public long getLastTimePlayed()
    {
        return lastTimePlayed;
    }

    public int compareTo(SaveFormatComparator saveformatcomparator)
    {
        if(lastTimePlayed < saveformatcomparator.lastTimePlayed)
        {
            return 1;
        }
        if(lastTimePlayed > saveformatcomparator.lastTimePlayed)
        {
            return -1;
        } else
        {
            return fileName.compareTo(saveformatcomparator.fileName);
        }
    }

    public int getGameType()
    {
        return gameType;
    }

    public int compareTo(Object obj)
    {
        return compareTo((SaveFormatComparator)obj);
    }

    private final String fileName;
    private final String displayName;
    private final long lastTimePlayed;
    private final long sizeOnDisk;
    private final boolean field_22167_e;
    private final int gameType;
}
