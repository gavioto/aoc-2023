package com.github.gavioto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String... args) {
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader("data/input17.txt"));
            String line = reader.readLine();

            while (line != null) {
                System.out.println(line);
                // read next line
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
/*
    public static void mainNew(String... args) {

        Driver driver = GraphDatabase.driver("bolt://3.87.203.0:7687",
                AuthTokens.basic("neo4j", "wrists-finishes-meat"));

        try (Session session = driver.session(SessionConfig.forDatabase("neo4j"))) {

            String cypherQuery = "MATCH (n)\n" +
                    "RETURN COUNT(n) AS count\n" +
                    "LIMIT $limit";

            var result = session.readTransaction(
                    tx -> tx.run(cypherQuery,
                            parameters("limit", "10"))
                            .list());

            for (Record record : result) {
                System.out.println(record.get("count").asString());
            }
        }
        driver.close();
        return;
    }

    public static void mainOld(String[] args) {

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

        // read matrix

        nRows = 17;
        nCols = 17;

        // create graph
        for (int row = 0; row < nRows; row++) {
            for (int col = 0; col < nCols; col++) {
                firstNode = tx.createNode();
                firstNode.setProperty("block", ((string) row) + "-" + ((string) col));
                firstNode.setProperty("cost", cost);
                secondNode = tx.createNode();
                secondNode.setProperty("message", "World!");

                relationship = firstNode.createRelationshipTo(secondNode, RelTypes.KNOWS);
                relationship.setProperty("message", "brave Neo4j ");
            }
        }

        // query graph

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
    */
}
