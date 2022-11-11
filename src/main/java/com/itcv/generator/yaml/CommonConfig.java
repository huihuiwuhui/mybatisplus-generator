package com.itcv.generator.yaml;


import lombok.Data;

@Data
public  class CommonConfig {

     private Db db;

    public static String projectPath;

    public static String outputDir;

    public static String outputXml;

    public static String author;

    public static String packageName;



    public static class Db{

        public static String url;

        public static String username;

        public static String password;

        public static String driver;

        public static String [] tableNames;

        public static String [] commonField;

        public static String [] fieldPrefixes;

        public static String [] tablePrefixes;

        public  String getUrl() {
            return url;
        }

        public  void setUrl(String url) {
            Db.url = url;
        }

        public  String getUsername() {
            return username;
        }

        public  void setUsername(String username) {
            Db.username = username;
        }

        public  String getPassword() {
            return password;
        }

        public  void setPassword(String password) {
            Db.password = password;
        }

        public String getDriver() {
            return driver;
        }

        public void setDriver(String driver) {
            Db.driver = driver;
        }

        public String[] getTableNames() {
            return tableNames;
        }

        public void setTableNames(String[] tableNames) {
            Db.tableNames = tableNames;
        }

        public  String[] getCommonField() {
            return commonField;
        }

        public  void setCommonField(String[] commonField) {
            Db.commonField = commonField;
        }

        public  String[] getFieldPrefixes() {
            return fieldPrefixes;
        }

        public  void setFieldPrefixes(String[] fieldPrefixes) {
            Db.fieldPrefixes = fieldPrefixes;
        }

        public String[] getTablePrefixes() {
            return tablePrefixes;
        }

        public void setTablePrefixes(String[] tablePrefixes) {
            Db.tablePrefixes = tablePrefixes;
        }
    }

    public String getProjectPath() {
        return projectPath;
    }

    public void setProjectPath(String projectPath) {
        this.projectPath = projectPath;
    }

    public String getOutputDir() {
        return outputDir;
    }

    public void setOutputDir(String outputDir) {
        this.outputDir = outputDir;
    }

    public String getOutputXml() {
        return outputXml;
    }

    public void setOutputXml(String outputXml) {
        this.outputXml = outputXml;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }
}
