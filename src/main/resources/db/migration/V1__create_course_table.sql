CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE course (
  id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
  code VARCHAR(100) NOT NULL UNIQUE,
  name VARCHAR(250) NOT NULL,
  workload INTEGER NOT NULL,
  original_period INTEGER NOT NULL,
  major VARCHAR(250) NOT NULL,
  mandatory_to_major BOOLEAN NOT NULL,
  type VARCHAR(250) NOT NULL
);