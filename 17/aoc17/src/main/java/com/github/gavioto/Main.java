package com.github.gavioto;

public class Main {

    public static void main(String[] args) {

        System.out.println(args[0]);

        private DatabaseManagementService managementService;

        managementService = new DatabaseManagementServiceBuilder("./neo4j").build();
        graphDb = managementService.database(DEFAULT_DATABASE_NAME);

        // to make sure Neo4j is shut down properly, add a shutdown hook:
        registerShutdownHook(managementService);

        GraphDatabaseService graphDb;
        Node firstNode;
        Node secondNode;
        Relationship relationship;


        
        // create database
        for(int row = 0; row < 17; row++){
            for(int col = 0; col < 17; col++){
                firstNode = tx.createNode();
                firstNode.setProperty("block", ((string)row)+"-"+((string)col));
                firstNode.setProperty("cost", cost);
                secondNode = tx.createNode();
                secondNode.setProperty("message", "World!");
        
                relationship = firstNode.createRelationshipTo(secondNode, RelTypes.KNOWS);
                relationship.setProperty("message", "brave Neo4j ");     
            }
        }
            
        return;
    }

    private static void registerShutdownHook(final DatabaseManagementService managementService) {
        // Registers a shutdown hook for the Neo4j instance so that it
        // shuts down nicely when the VM exits (even if you "Ctrl-C" the
        // running application).
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                managementService.shutdown();
            }
        });
    }
}
