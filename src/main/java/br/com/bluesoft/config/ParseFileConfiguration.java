package br.com.bluesoft.config;

/**
 * Created by william on 17/07/15.
 */
public interface ParseFileConfiguration {

    public Class<?> getClassMapped(int idLinePosition, int lengthLinePosition, String line);
}
